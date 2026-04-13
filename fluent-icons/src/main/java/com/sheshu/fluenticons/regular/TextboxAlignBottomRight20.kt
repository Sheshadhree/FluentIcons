package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextboxAlignBottomRight20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextboxAlignBottomRight20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.5f, 3f)
            curveTo(4.12f, 3f, 3f, 4.12f, 3f, 5.5f)
            verticalLineToRelative(9f)
            curveTo(3f, 15.88f, 4.12f, 17f, 5.5f, 17f)
            horizontalLineToRelative(9f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-9f)
            curveTo(17f, 4.12f, 15.88f, 3f, 14.5f, 3f)
            horizontalLineToRelative(-9f)
            close()
            moveTo(4f, 5.5f)
            curveTo(4f, 4.672f, 4.672f, 4f, 5.5f, 4f)
            horizontalLineToRelative(9f)
            curveTo(15.328f, 4f, 16f, 4.672f, 16f, 5.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-9f)
            curveTo(4.672f, 16f, 4f, 15.328f, 4f, 14.5f)
            verticalLineToRelative(-9f)
            close()
            moveToRelative(9.5f, 4.5f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(13.776f, 11f, 13.5f, 11f)
            horizontalLineToRelative(-7f)
            curveTo(6.224f, 11f, 6f, 10.776f, 6f, 10.5f)
            reflectiveCurveTo(6.224f, 10f, 6.5f, 10f)
            horizontalLineToRelative(7f)
            close()
            moveToRelative(0f, 3f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(13.776f, 14f, 13.5f, 14f)
            horizontalLineToRelative(-5f)
            curveTo(8.224f, 14f, 8f, 13.776f, 8f, 13.5f)
            reflectiveCurveTo(8.224f, 13f, 8.5f, 13f)
            horizontalLineToRelative(5f)
            close()
        }
    }.build()
}
