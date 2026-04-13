package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowLeft20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowLeft20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.73f, 16.795f)
            curveToRelative(0.302f, 0.285f, 0.776f, 0.271f, 1.061f, -0.03f)
            curveToRelative(0.285f, -0.3f, 0.271f, -0.775f, -0.03f, -1.06f)
            lineTo(4.522f, 10.75f)
            horizontalLineToRelative(12.724f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineTo(4.52f)
            lineToRelative(5.241f, -4.957f)
            curveToRelative(0.301f, -0.285f, 0.315f, -0.76f, 0.03f, -1.06f)
            curveToRelative(-0.285f, -0.301f, -0.76f, -0.315f, -1.06f, -0.03f)
            lineToRelative(-6.418f, 6.07f)
            curveTo(2.147f, 9.43f, 2.047f, 9.63f, 2.013f, 9.839f)
            curveTo(2.004f, 9.89f, 1.997f, 9.945f, 1.997f, 10f)
            curveToRelative(0f, 0.058f, 0.007f, 0.114f, 0.019f, 0.168f)
            curveToRelative(0.035f, 0.206f, 0.134f, 0.402f, 0.298f, 0.558f)
            lineToRelative(6.418f, 6.07f)
            close()
        }
    }.build()
}
