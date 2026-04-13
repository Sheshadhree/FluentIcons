package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.MailRead24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MailRead24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.81f, 2.34f)
            curveToRelative(0.728f, -0.455f, 1.652f, -0.455f, 2.38f, 0f)
            lineToRelative(7.75f, 4.833f)
            curveToRelative(0.078f, 0.048f, 0.151f, 0.1f, 0.221f, 0.157f)
            lineTo(12f, 12.15f)
            lineTo(2.834f, 7.333f)
            curveToRelative(0.071f, -0.057f, 0.147f, -0.11f, 0.225f, -0.16f)
            lineToRelative(7.75f, -4.834f)
            close()
            moveTo(2.048f, 8.614f)
            curveTo(2.017f, 8.767f, 2f, 8.924f, 2f, 9.082f)
            verticalLineToRelative(7.668f)
            curveTo(2f, 18.545f, 3.455f, 20f, 5.25f, 20f)
            horizontalLineToRelative(13.5f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineTo(9.082f)
            curveToRelative(0f, -0.16f, -0.017f, -0.319f, -0.05f, -0.473f)
            lineToRelative(-9.6f, 5.052f)
            curveToRelative(-0.22f, 0.115f, -0.48f, 0.115f, -0.699f, 0f)
            lineTo(2.05f, 8.615f)
            close()
        }
    }.build()
}
