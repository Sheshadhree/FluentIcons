package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.MailCopy24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MailCopy24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 7.511f)
            curveTo(2.097f, 8.09f, 1.5f, 9.1f, 1.5f, 10.25f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 2.9f, 2.35f, 5.25f, 5.25f, 5.25f)
            horizontalLineToRelative(9f)
            curveToRelative(1.15f, 0f, 2.161f, -0.598f, 2.739f, -1.5f)
            horizontalLineTo(6.75f)
            curveTo(4.679f, 20f, 3f, 18.321f, 3f, 16.25f)
            verticalLineTo(7.511f)
            close()
            moveTo(4f, 8.11f)
            verticalLineToRelative(7.64f)
            curveToRelative(0f, 1.733f, 1.356f, 3.15f, 3.066f, 3.245f)
            lineTo(7.25f, 19f)
            horizontalLineToRelative(11.5f)
            curveToRelative(1.733f, 0f, 3.15f, -1.357f, 3.245f, -3.066f)
            lineTo(22f, 15.75f)
            verticalLineTo(8.11f)
            lineToRelative(-8.65f, 4.554f)
            curveToRelative(-0.22f, 0.115f, -0.48f, 0.115f, -0.7f, 0f)
            lineTo(4f, 8.11f)
            close()
            moveTo(18.75f, 4f)
            horizontalLineTo(7.25f)
            curveTo(5.725f, 4f, 4.446f, 5.05f, 4.095f, 6.466f)
            lineTo(13f, 11.152f)
            lineToRelative(8.905f, -4.686f)
            curveToRelative(-0.336f, -1.357f, -1.525f, -2.378f, -2.966f, -2.46f)
            lineTo(18.75f, 4f)
            close()
        }
    }.build()
}
