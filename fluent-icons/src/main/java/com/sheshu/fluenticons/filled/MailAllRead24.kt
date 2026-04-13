package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.MailAllRead24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MailAllRead24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.36f, 1.842f)
            curveToRelative(-0.225f, -0.123f, -0.495f, -0.123f, -0.72f, 0f)
            lineToRelative(-7.81f, 4.26f)
            curveToRelative(-0.168f, 0.091f, -0.314f, 0.21f, -0.436f, 0.35f)
            lineTo(11f, 11.146f)
            lineToRelative(8.606f, -4.695f)
            curveToRelative(-0.122f, -0.139f, -0.268f, -0.257f, -0.436f, -0.349f)
            lineToRelative(-7.81f, -4.26f)
            close()
            moveTo(2f, 15.75f)
            verticalLineTo(7.945f)
            lineToRelative(8.64f, 4.713f)
            curveToRelative(0.225f, 0.123f, 0.495f, 0.123f, 0.72f, 0f)
            lineTo(20f, 7.945f)
            verticalLineToRelative(7.805f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 19f, 2f, 17.545f, 2f, 15.75f)
            close()
            moveToRelative(19.001f, -8.239f)
            curveToRelative(0.902f, 0.578f, 1.5f, 1.589f, 1.5f, 2.739f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 2.9f, -2.351f, 5.25f, -5.25f, 5.25f)
            horizontalLineToRelative(-9f)
            curveToRelative(-1.15f, 0f, -2.162f, -0.598f, -2.74f, -1.5f)
            horizontalLineToRelative(11.74f)
            curveToRelative(2.07f, 0f, 3.75f, -1.679f, 3.75f, -3.75f)
            verticalLineTo(7.511f)
            close()
        }
    }.build()
}
