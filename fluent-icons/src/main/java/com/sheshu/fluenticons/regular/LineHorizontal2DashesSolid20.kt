package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.LineHorizontal2DashesSolid20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.LineHorizontal2DashesSolid20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.5f, 6f)
            curveTo(2.224f, 6f, 2f, 6.224f, 2f, 6.5f)
            reflectiveCurveTo(2.224f, 7f, 2.5f, 7f)
            horizontalLineToRelative(3f)
            curveTo(5.776f, 7f, 6f, 6.776f, 6f, 6.5f)
            reflectiveCurveTo(5.776f, 6f, 5.5f, 6f)
            horizontalLineToRelative(-3f)
            close()
            moveToRelative(6f, 0f)
            curveTo(8.224f, 6f, 8f, 6.224f, 8f, 6.5f)
            reflectiveCurveTo(8.224f, 7f, 8.5f, 7f)
            horizontalLineToRelative(3f)
            curveTo(11.776f, 7f, 12f, 6.776f, 12f, 6.5f)
            reflectiveCurveTo(11.776f, 6f, 11.5f, 6f)
            horizontalLineToRelative(-3f)
            close()
            moveToRelative(6f, 0f)
            curveTo(14.224f, 6f, 14f, 6.224f, 14f, 6.5f)
            reflectiveCurveTo(14.224f, 7f, 14.5f, 7f)
            horizontalLineToRelative(3f)
            curveTo(17.776f, 7f, 18f, 6.776f, 18f, 6.5f)
            reflectiveCurveTo(17.776f, 6f, 17.5f, 6f)
            horizontalLineToRelative(-3f)
            close()
            moveToRelative(-12f, 6f)
            curveTo(2.224f, 12f, 2f, 12.224f, 2f, 12.5f)
            reflectiveCurveTo(2.224f, 13f, 2.5f, 13f)
            horizontalLineToRelative(15f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(17.776f, 12f, 17.5f, 12f)
            horizontalLineToRelative(-15f)
            close()
        }
    }.build()
}
