package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.MailRead20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MailRead20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.257f, 1.071f)
            curveToRelative(-0.158f, -0.095f, -0.356f, -0.095f, -0.514f, 0f)
            lineTo(2.97f, 5.134f)
            curveToRelative(-0.15f, 0.09f, -0.286f, 0.198f, -0.405f, 0.32f)
            lineTo(10f, 9.918f)
            lineToRelative(7.435f, -4.461f)
            curveToRelative(-0.12f, -0.123f, -0.255f, -0.231f, -0.406f, -0.322f)
            lineToRelative(-6.772f, -4.063f)
            close()
            moveToRelative(7.673f, 5.254f)
            lineToRelative(-7.673f, 4.604f)
            curveToRelative(-0.158f, 0.095f, -0.356f, 0.095f, -0.514f, 0f)
            lineTo(2.07f, 6.323f)
            curveTo(2.024f, 6.493f, 2f, 6.67f, 2f, 6.85f)
            verticalLineToRelative(6.65f)
            curveTo(2f, 14.88f, 3.12f, 16f, 4.5f, 16f)
            horizontalLineToRelative(11f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineTo(6.85f)
            curveToRelative(0f, -0.18f, -0.024f, -0.356f, -0.07f, -0.525f)
            close()
        }
    }.build()
}
