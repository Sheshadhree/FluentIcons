package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TextboxAlignBottomCenter20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextboxAlignBottomCenter20",
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
            moveToRelative(1f, 7f)
            horizontalLineToRelative(7f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(13.776f, 11f, 13.5f, 11f)
            horizontalLineToRelative(-7f)
            curveTo(6.224f, 11f, 6f, 10.776f, 6f, 10.5f)
            reflectiveCurveTo(6.224f, 10f, 6.5f, 10f)
            close()
            moveToRelative(1f, 3f)
            horizontalLineToRelative(5f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(12.776f, 14f, 12.5f, 14f)
            horizontalLineToRelative(-5f)
            curveTo(7.224f, 14f, 7f, 13.776f, 7f, 13.5f)
            reflectiveCurveTo(7.224f, 13f, 7.5f, 13f)
            close()
        }
    }.build()
}
