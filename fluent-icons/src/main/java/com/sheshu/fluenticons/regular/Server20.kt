package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Server20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Server20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.5f, 5f)
            curveTo(7.224f, 5f, 7f, 5.224f, 7f, 5.5f)
            reflectiveCurveTo(7.224f, 6f, 7.5f, 6f)
            horizontalLineToRelative(5f)
            curveTo(12.776f, 6f, 13f, 5.776f, 13f, 5.5f)
            reflectiveCurveTo(12.776f, 5f, 12.5f, 5f)
            horizontalLineToRelative(-5f)
            close()
            moveTo(7f, 12.5f)
            curveTo(7f, 12.224f, 7.224f, 12f, 7.5f, 12f)
            horizontalLineToRelative(5f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(12.776f, 13f, 12.5f, 13f)
            horizontalLineToRelative(-5f)
            curveTo(7.224f, 13f, 7f, 12.776f, 7f, 12.5f)
            close()
            moveTo(7.5f, 14f)
            curveTo(7.224f, 14f, 7f, 14.224f, 7f, 14.5f)
            reflectiveCurveTo(7.224f, 15f, 7.5f, 15f)
            horizontalLineToRelative(5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(12.776f, 14f, 12.5f, 14f)
            horizontalLineToRelative(-5f)
            close()
            moveTo(5f, 4.5f)
            curveTo(5f, 3.12f, 6.12f, 2f, 7.5f, 2f)
            horizontalLineToRelative(5f)
            curveTo(13.88f, 2f, 15f, 3.12f, 15f, 4.5f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-5f)
            curveTo(6.12f, 18f, 5f, 16.88f, 5f, 15.5f)
            verticalLineToRelative(-11f)
            close()
            moveTo(7.5f, 3f)
            curveTo(6.672f, 3f, 6f, 3.672f, 6f, 4.5f)
            verticalLineToRelative(11f)
            curveTo(6f, 16.328f, 6.672f, 17f, 7.5f, 17f)
            horizontalLineToRelative(5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-11f)
            curveTo(14f, 3.672f, 13.328f, 3f, 12.5f, 3f)
            horizontalLineToRelative(-5f)
            close()
        }
    }.build()
}
