package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PersonShield16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonShield16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.12f, 6.554f)
            curveToRelative(0.202f, -0.193f, 0.559f, -0.193f, 0.76f, 0f)
            curveToRelative(0.508f, 0.484f, 1.484f, 1.254f, 2.683f, 1.412f)
            curveTo(14.803f, 7.997f, 15f, 8.178f, 15f, 8.403f)
            verticalLineToRelative(2.112f)
            curveToRelative(0f, 2.838f, -2.784f, 3.869f, -3.386f, 4.058f)
            curveToRelative(-0.075f, 0.024f, -0.152f, 0.024f, -0.227f, 0f)
            curveTo(10.785f, 14.383f, 8f, 13.353f, 8f, 10.515f)
            verticalLineToRelative(-2.11f)
            curveToRelative(0f, -0.227f, 0.197f, -0.408f, 0.437f, -0.44f)
            curveToRelative(1.199f, -0.157f, 2.174f, -0.927f, 2.682f, -1.411f)
            close()
            moveTo(7.067f, 8f)
            curveTo(7.025f, 8.125f, 7f, 8.26f, 7f, 8.404f)
            verticalLineToRelative(2.112f)
            curveToRelative(0f, 1.48f, 0.634f, 2.57f, 1.402f, 3.336f)
            curveTo(7.97f, 13.947f, 7.501f, 14f, 7f, 14f)
            curveToRelative(-3.14f, 0f, -5f, -2.029f, -5f, -4f)
            verticalLineTo(9.5f)
            curveTo(2f, 8.672f, 2.672f, 8f, 3.5f, 8f)
            horizontalLineToRelative(3.568f)
            close()
            moveTo(7f, 1.5f)
            curveToRelative(1.519f, 0f, 2.75f, 1.231f, 2.75f, 2.75f)
            reflectiveCurveTo(8.519f, 7f, 7f, 7f)
            reflectiveCurveTo(4.25f, 5.769f, 4.25f, 4.25f)
            reflectiveCurveTo(5.481f, 1.5f, 7f, 1.5f)
            close()
        }
    }.build()
}
