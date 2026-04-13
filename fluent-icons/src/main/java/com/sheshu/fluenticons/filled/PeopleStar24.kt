package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PeopleStar24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PeopleStar24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 11f)
            curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
            reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
            reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
            reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
            close()
            moveToRelative(9f, 0f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            reflectiveCurveToRelative(-1.343f, -3f, -3f, -3f)
            reflectiveCurveToRelative(-3f, 1.343f, -3f, 3f)
            reflectiveCurveToRelative(1.343f, 3f, 3f, 3f)
            close()
            moveTo(4.25f, 13f)
            curveTo(3.007f, 13f, 2f, 14.007f, 2f, 15.25f)
            verticalLineToRelative(0.25f)
            reflectiveCurveTo(2f, 20f, 8f, 20f)
            curveToRelative(1.39f, 0f, 2.458f, -0.241f, 3.278f, -0.613f)
            curveTo(11.098f, 18.79f, 11f, 18.157f, 11f, 17.5f)
            curveToRelative(0f, -1.657f, 0.62f, -3.169f, 1.64f, -4.317f)
            curveTo(12.367f, 13.065f, 12.066f, 13f, 11.75f, 13f)
            horizontalLineToRelative(-7.5f)
            close()
            moveTo(23f, 17.5f)
            curveToRelative(0f, 3.038f, -2.462f, 5.5f, -5.5f, 5.5f)
            reflectiveCurveTo(12f, 20.538f, 12f, 17.5f)
            reflectiveCurveToRelative(2.462f, -5.5f, 5.5f, -5.5f)
            reflectiveCurveToRelative(5.5f, 2.462f, 5.5f, 5.5f)
            close()
            moveToRelative(-4.945f, -3.08f)
            curveToRelative(-0.174f, -0.56f, -0.936f, -0.56f, -1.11f, 0f)
            lineToRelative(-0.557f, 1.788f)
            horizontalLineToRelative(-1.803f)
            curveToRelative(-0.566f, 0f, -0.8f, 0.754f, -0.343f, 1.1f)
            lineToRelative(1.458f, 1.105f)
            lineToRelative(-0.557f, 1.787f)
            curveToRelative(-0.175f, 0.561f, 0.441f, 1.028f, 0.899f, 0.681f)
            lineToRelative(1.458f, -1.104f)
            lineToRelative(1.458f, 1.104f)
            curveToRelative(0.458f, 0.347f, 1.074f, -0.12f, 0.899f, -0.68f)
            lineTo(19.3f, 18.412f)
            lineToRelative(1.458f, -1.104f)
            curveToRelative(0.458f, -0.347f, 0.223f, -1.101f, -0.343f, -1.101f)
            horizontalLineToRelative(-1.803f)
            lineToRelative(-0.557f, -1.787f)
            close()
        }
    }.build()
}
