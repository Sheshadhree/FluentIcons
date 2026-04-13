package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowRight20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowRight20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.265f, 3.205f)
            curveToRelative(-0.3f, -0.284f, -0.775f, -0.271f, -1.06f, 0.03f)
            curveToRelative(-0.284f, 0.3f, -0.271f, 0.775f, 0.03f, 1.06f)
            lineToRelative(5.239f, 4.955f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 9.25f, 2f, 9.586f, 2f, 10f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(12.726f)
            lineToRelative(-5.241f, 4.957f)
            curveToRelative(-0.301f, 0.285f, -0.314f, 0.76f, -0.03f, 1.06f)
            curveToRelative(0.285f, 0.301f, 0.76f, 0.315f, 1.06f, 0.03f)
            lineToRelative(6.418f, -6.07f)
            curveToRelative(0.166f, -0.157f, 0.266f, -0.357f, 0.3f, -0.566f)
            curveTo(17.994f, 10.11f, 18f, 10.055f, 18f, 10f)
            curveToRelative(0f, -0.058f, -0.006f, -0.114f, -0.019f, -0.168f)
            curveToRelative(-0.035f, -0.205f, -0.134f, -0.402f, -0.298f, -0.557f)
            lineToRelative(-6.418f, -6.07f)
            close()
        }
    }.build()
}
