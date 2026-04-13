package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TicketHorizontal20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TicketHorizontal20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.5f, 5f)
            curveTo(17.328f, 5f, 18f, 5.672f, 18f, 6.5f)
            verticalLineTo(8f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            curveToRelative(-0.828f, 0f, -1.5f, 0.672f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-13f)
            curveTo(2.672f, 15f, 2f, 14.328f, 2f, 13.5f)
            verticalLineTo(12f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            reflectiveCurveTo(3.328f, 8.5f, 2.5f, 8.5f)
            curveTo(2.224f, 8.5f, 2f, 8.276f, 2f, 8f)
            verticalLineTo(6.5f)
            curveTo(2f, 5.672f, 2.672f, 5f, 3.5f, 5f)
            horizontalLineToRelative(13f)
            close()
            moveTo(17f, 6.5f)
            curveTo(17f, 6.224f, 16.776f, 6f, 16.5f, 6f)
            horizontalLineToRelative(-13f)
            curveTo(3.224f, 6f, 3f, 6.224f, 3f, 6.5f)
            verticalLineToRelative(1.05f)
            curveTo(4.141f, 7.782f, 5f, 8.79f, 5f, 10f)
            curveToRelative(0f, 1.21f, -0.859f, 2.218f, -2f, 2.45f)
            verticalLineToRelative(1.05f)
            curveTo(3f, 13.776f, 3.224f, 14f, 3.5f, 14f)
            horizontalLineToRelative(13f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-1.05f)
            curveToRelative(-1.141f, -0.232f, -2f, -1.24f, -2f, -2.45f)
            curveToRelative(0f, -1.152f, 0.779f, -2.122f, 1.839f, -2.412f)
            lineTo(17f, 7.55f)
            verticalLineTo(6.5f)
            close()
        }
    }.build()
}
