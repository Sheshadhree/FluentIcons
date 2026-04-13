package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TextboxAlignBottomRotate9020: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextboxAlignBottomRotate9020",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17f, 5.5f)
            curveTo(17f, 4.12f, 15.88f, 3f, 14.5f, 3f)
            horizontalLineToRelative(-9f)
            curveTo(4.12f, 3f, 3f, 4.12f, 3f, 5.5f)
            verticalLineToRelative(9f)
            curveTo(3f, 15.88f, 4.12f, 17f, 5.5f, 17f)
            horizontalLineToRelative(9f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-9f)
            close()
            moveToRelative(-7f, 1f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(9f, 13.776f, 9f, 13.5f)
            verticalLineToRelative(-7f)
            curveTo(9f, 6.224f, 9.224f, 6f, 9.5f, 6f)
            reflectiveCurveTo(10f, 6.224f, 10f, 6.5f)
            close()
            moveToRelative(-3f, 0f)
            verticalLineToRelative(7f)
            curveTo(7f, 13.776f, 6.776f, 14f, 6.5f, 14f)
            reflectiveCurveTo(6f, 13.776f, 6f, 13.5f)
            verticalLineToRelative(-7f)
            curveTo(6f, 6.224f, 6.224f, 6f, 6.5f, 6f)
            reflectiveCurveTo(7f, 6.224f, 7f, 6.5f)
            close()
        }
    }.build()
}
