package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.MailUnread32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MailUnread32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(27f, 10f)
            curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
            reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
            reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
            reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
            close()
            moveTo(6.5f, 5f)
            horizontalLineToRelative(15.09f)
            curveToRelative(-0.059f, 0.324f, -0.09f, 0.659f, -0.09f, 1f)
            curveToRelative(0f, 0.341f, 0.031f, 0.676f, 0.09f, 1f)
            horizontalLineTo(6.5f)
            curveTo(5.12f, 7f, 4f, 8.12f, 4f, 9.5f)
            verticalLineToRelative(0.903f)
            lineToRelative(12f, 6.461f)
            lineToRelative(10.1f, -5.438f)
            curveToRelative(0.292f, 0.05f, 0.593f, 0.074f, 0.9f, 0.074f)
            curveToRelative(1.107f, 0f, 2.137f, -0.327f, 3f, -0.89f)
            verticalLineTo(22.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-19f)
            curveTo(4.015f, 27f, 2f, 24.985f, 2f, 22.5f)
            verticalLineToRelative(-13f)
            curveTo(2f, 7.015f, 4.015f, 5f, 6.5f, 5f)
            close()
            moveTo(4f, 12.674f)
            verticalLineTo(22.5f)
            curveTo(4f, 23.88f, 5.12f, 25f, 6.5f, 25f)
            horizontalLineToRelative(19f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-9.826f)
            lineToRelative(-11.526f, 6.207f)
            curveToRelative(-0.296f, 0.159f, -0.652f, 0.159f, -0.948f, 0f)
            lineTo(4f, 12.674f)
            close()
        }
    }.build()
}
