package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.MailMultiple24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MailMultiple24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21f, 7.511f)
            curveToRelative(0.902f, 0.578f, 1.5f, 1.589f, 1.5f, 2.739f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 2.9f, -2.35f, 5.25f, -5.25f, 5.25f)
            horizontalLineToRelative(-9f)
            curveToRelative(-1.15f, 0f, -2.161f, -0.598f, -2.739f, -1.5f)
            horizontalLineTo(17.25f)
            curveToRelative(2.071f, 0f, 3.75f, -1.679f, 3.75f, -3.75f)
            verticalLineTo(7.511f)
            close()
            moveTo(20f, 8.11f)
            verticalLineToRelative(7.64f)
            curveToRelative(0f, 1.733f, -1.357f, 3.15f, -3.066f, 3.245f)
            lineTo(16.75f, 19f)
            horizontalLineTo(5.25f)
            curveToRelative(-1.733f, 0f, -3.15f, -1.357f, -3.245f, -3.066f)
            lineTo(2f, 15.75f)
            verticalLineTo(8.11f)
            lineToRelative(8.65f, 4.554f)
            curveToRelative(0.22f, 0.115f, 0.48f, 0.115f, 0.7f, 0f)
            lineTo(20f, 8.11f)
            close()
            moveTo(5.25f, 4f)
            horizontalLineToRelative(11.5f)
            curveToRelative(1.525f, 0f, 2.804f, 1.05f, 3.155f, 2.466f)
            lineTo(11f, 11.152f)
            lineTo(2.095f, 6.466f)
            curveTo(2.431f, 5.11f, 3.62f, 4.088f, 5.061f, 4.006f)
            lineTo(5.25f, 4f)
            close()
        }
    }.build()
}
