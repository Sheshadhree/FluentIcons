package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.FlagClock24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FlagClock24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.75f, 2.998f)
            curveTo(3.336f, 2.998f, 3f, 3.334f, 3f, 3.748f)
            verticalLineTo(21.25f)
            lineToRelative(0.007f, 0.102f)
            curveTo(3.057f, 21.718f, 3.37f, 22f, 3.75f, 22f)
            lineToRelative(0.102f, -0.007f)
            curveTo(4.218f, 21.943f, 4.5f, 21.63f, 4.5f, 21.25f)
            verticalLineTo(16.5f)
            horizontalLineToRelative(6.576f)
            curveTo(11.557f, 13.385f, 14.25f, 11f, 17.5f, 11f)
            lineToRelative(0.129f, 0.001f)
            lineToRelative(-0.94f, -1.252f)
            lineToRelative(4.165f, -5.55f)
            curveToRelative(0.371f, -0.495f, 0.018f, -1.201f, -0.6f, -1.201f)
            horizontalLineTo(3.75f)
            close()
            moveTo(23f, 17.5f)
            curveToRelative(0f, -3.038f, -2.462f, -5.5f, -5.5f, -5.5f)
            reflectiveCurveTo(12f, 14.462f, 12f, 17.5f)
            reflectiveCurveToRelative(2.462f, 5.5f, 5.5f, 5.5f)
            reflectiveCurveToRelative(5.5f, -2.462f, 5.5f, -5.5f)
            close()
            moveTo(17.5f, 14f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineTo(17f)
            horizontalLineToRelative(2f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(20.276f, 18f, 20f, 18f)
            horizontalLineToRelative(-2.5f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            close()
        }
    }.build()
}
