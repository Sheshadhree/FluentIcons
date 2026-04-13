package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowUp20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowUp20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.201f, 8.735f)
            curveToRelative(-0.284f, 0.3f, -0.271f, 0.775f, 0.03f, 1.06f)
            curveToRelative(0.3f, 0.284f, 0.775f, 0.271f, 1.06f, -0.03f)
            lineToRelative(4.955f, -5.239f)
            verticalLineTo(17.25f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(4.524f)
            lineToRelative(4.957f, 5.241f)
            curveToRelative(0.285f, 0.301f, 0.76f, 0.314f, 1.06f, 0.03f)
            curveToRelative(0.301f, -0.285f, 0.315f, -0.76f, 0.03f, -1.06f)
            lineToRelative(-6.07f, -6.418f)
            curveToRelative(-0.157f, -0.166f, -0.357f, -0.266f, -0.566f, -0.3f)
            curveTo(10.106f, 2.006f, 10.053f, 2f, 9.998f, 2f)
            curveToRelative(-0.061f, 0f, -0.117f, 0.006f, -0.17f, 0.019f)
            curveTo(9.623f, 2.054f, 9.426f, 2.153f, 9.27f, 2.317f)
            lineTo(3.2f, 8.735f)
            close()
        }
    }.build()
}
