package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.MailClock32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MailClock32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23f, 16.5f)
            curveToRelative(-4.142f, 0f, -7.5f, -3.358f, -7.5f, -7.5f)
            curveToRelative(0f, -4.142f, 3.358f, -7.5f, 7.5f, -7.5f)
            curveToRelative(4.142f, 0f, 7.5f, 3.358f, 7.5f, 7.5f)
            curveToRelative(0f, 4.142f, -3.358f, 7.5f, -7.5f, 7.5f)
            close()
            moveTo(22.75f, 4f)
            curveTo(22.336f, 4f, 22f, 4.336f, 22f, 4.75f)
            verticalLineToRelative(4.5f)
            curveTo(22f, 9.664f, 22.336f, 10f, 22.75f, 10f)
            horizontalLineToRelative(3.5f)
            curveTo(26.664f, 10f, 27f, 9.664f, 27f, 9.25f)
            reflectiveCurveTo(26.664f, 8.5f, 26.25f, 8.5f)
            horizontalLineTo(23.5f)
            verticalLineTo(4.75f)
            curveTo(23.5f, 4.336f, 23.164f, 4f, 22.75f, 4f)
            close()
            moveTo(6.5f, 5f)
            horizontalLineToRelative(8.435f)
            curveToRelative(-0.312f, 0.628f, -0.553f, 1.299f, -0.712f, 2f)
            horizontalLineTo(6.5f)
            curveTo(5.12f, 7f, 4f, 8.12f, 4f, 9.5f)
            verticalLineToRelative(0.903f)
            lineToRelative(12f, 6.461f)
            lineToRelative(1.448f, -0.78f)
            curveToRelative(0.61f, 0.48f, 1.285f, 0.881f, 2.007f, 1.191f)
            lineToRelative(-2.981f, 1.606f)
            curveToRelative(-0.296f, 0.159f, -0.652f, 0.159f, -0.948f, 0f)
            lineTo(4f, 12.674f)
            verticalLineTo(22.5f)
            curveTo(4f, 23.88f, 5.12f, 25f, 6.5f, 25f)
            horizontalLineToRelative(19f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-6.015f)
            curveToRelative(0.755f, -0.506f, 1.43f, -1.123f, 2f, -1.828f)
            verticalLineTo(22.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-19f)
            curveTo(4.015f, 27f, 2f, 24.985f, 2f, 22.5f)
            verticalLineToRelative(-13f)
            curveTo(2f, 7.015f, 4.015f, 5f, 6.5f, 5f)
            close()
        }
    }.build()
}
