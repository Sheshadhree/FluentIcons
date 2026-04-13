package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Tag32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Tag32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.934f, 3f)
            curveToRelative(-0.862f, 0f, -1.689f, 0.342f, -2.298f, 0.952f)
            lineToRelative(-11.68f, 11.68f)
            curveToRelative(-1.27f, 1.27f, -1.27f, 3.327f, 0f, 4.596f)
            lineToRelative(7.818f, 7.818f)
            curveToRelative(1.269f, 1.27f, 3.327f, 1.27f, 4.596f, 0f)
            lineToRelative(11.68f, -11.68f)
            curveToRelative(0.61f, -0.61f, 0.952f, -1.436f, 0.952f, -2.298f)
            verticalLineTo(6.25f)
            curveToRelative(0f, -1.795f, -1.455f, -3.25f, -3.25f, -3.25f)
            horizontalLineToRelative(-7.818f)
            close()
            moveTo(17.05f, 5.366f)
            curveTo(17.284f, 5.132f, 17.602f, 5f, 17.934f, 5f)
            horizontalLineToRelative(7.818f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            verticalLineToRelative(7.818f)
            curveToRelative(0f, 0.332f, -0.132f, 0.65f, -0.366f, 0.884f)
            lineToRelative(-11.68f, 11.68f)
            curveToRelative(-0.488f, 0.488f, -1.28f, 0.488f, -1.768f, 0f)
            lineTo(5.37f, 18.814f)
            curveToRelative(-0.488f, -0.488f, -0.488f, -1.28f, 0f, -1.768f)
            lineToRelative(11.68f, -11.68f)
            close()
            moveTo(23.002f, 11f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            reflectiveCurveToRelative(-0.895f, -2f, -2f, -2f)
            reflectiveCurveToRelative(-2f, 0.895f, -2f, 2f)
            reflectiveCurveToRelative(0.895f, 2f, 2f, 2f)
            close()
        }
    }.build()
}
