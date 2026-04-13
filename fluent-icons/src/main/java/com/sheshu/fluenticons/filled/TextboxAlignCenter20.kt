package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TextboxAlignCenter20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextboxAlignCenter20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.5f, 3f)
            curveTo(15.88f, 3f, 17f, 4.12f, 17f, 5.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-9f)
            curveTo(4.12f, 17f, 3f, 15.88f, 3f, 14.5f)
            verticalLineToRelative(-9f)
            curveTo(3f, 4.12f, 4.12f, 3f, 5.5f, 3f)
            horizontalLineToRelative(9f)
            close()
            moveToRelative(-8f, 5f)
            curveTo(6.224f, 8f, 6f, 8.224f, 6f, 8.5f)
            reflectiveCurveTo(6.224f, 9f, 6.5f, 9f)
            horizontalLineToRelative(7f)
            curveTo(13.776f, 9f, 14f, 8.776f, 14f, 8.5f)
            reflectiveCurveTo(13.776f, 8f, 13.5f, 8f)
            horizontalLineToRelative(-7f)
            close()
            moveToRelative(1f, 3f)
            curveTo(7.224f, 11f, 7f, 11.224f, 7f, 11.5f)
            reflectiveCurveTo(7.224f, 12f, 7.5f, 12f)
            horizontalLineToRelative(5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(12.776f, 11f, 12.5f, 11f)
            horizontalLineToRelative(-5f)
            close()
        }
    }.build()
}
