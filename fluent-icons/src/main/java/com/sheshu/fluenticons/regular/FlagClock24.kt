package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.FlagClock24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.FlagClock24",
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
            curveToRelative(0.081f, -0.523f, 0.224f, -1.025f, 0.422f, -1.5f)
            horizontalLineTo(4.5f)
            verticalLineTo(4.498f)
            horizontalLineToRelative(14.254f)
            lineTo(15.152f, 9.3f)
            curveToRelative(-0.2f, 0.267f, -0.2f, 0.634f, 0f, 0.9f)
            lineToRelative(0.75f, 0.999f)
            curveTo(16.411f, 11.068f, 16.947f, 11f, 17.5f, 11f)
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
