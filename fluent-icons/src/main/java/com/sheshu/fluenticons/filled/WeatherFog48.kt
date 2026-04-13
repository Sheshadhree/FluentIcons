package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.WeatherFog48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.WeatherFog48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(32.25f, 38.5f)
            curveToRelative(0.967f, 0f, 1.75f, 0.784f, 1.75f, 1.75f)
            curveToRelative(0f, 0.918f, -0.706f, 1.671f, -1.606f, 1.744f)
            lineTo(32.251f, 42f)
            horizontalLineToRelative(-16.5f)
            curveTo(14.784f, 42f, 14f, 41.217f, 14f, 40.25f)
            curveToRelative(0f, -0.918f, 0.707f, -1.671f, 1.606f, -1.744f)
            lineTo(15.75f, 38.5f)
            horizontalLineToRelative(16.5f)
            close()
            moveToRelative(6f, -5.995f)
            curveToRelative(0.967f, 0f, 1.75f, 0.783f, 1.75f, 1.75f)
            curveToRelative(0f, 0.918f, -0.706f, 1.671f, -1.606f, 1.744f)
            lineToRelative(-0.143f, 0.006f)
            horizontalLineTo(9.75f)
            curveToRelative(-0.966f, 0f, -1.75f, -0.784f, -1.75f, -1.75f)
            curveToRelative(0f, -0.918f, 0.707f, -1.671f, 1.607f, -1.744f)
            lineToRelative(0.143f, -0.006f)
            horizontalLineToRelative(28.5f)
            close()
            moveTo(24f, 6.01f)
            curveToRelative(6.337f, 0f, 9.932f, 4.194f, 10.455f, 9.26f)
            horizontalLineToRelative(0.16f)
            curveToRelative(4.078f, 0f, 7.384f, 3.297f, 7.384f, 7.365f)
            reflectiveCurveTo(38.692f, 30f, 34.614f, 30f)
            horizontalLineToRelative(-21.23f)
            curveTo(9.306f, 30f, 6f, 26.703f, 6f, 22.635f)
            reflectiveCurveToRelative(3.306f, -7.365f, 7.384f, -7.365f)
            horizontalLineToRelative(0.16f)
            curveTo(14.07f, 10.171f, 17.662f, 6.01f, 24f, 6.01f)
            close()
        }
    }.build()
}
