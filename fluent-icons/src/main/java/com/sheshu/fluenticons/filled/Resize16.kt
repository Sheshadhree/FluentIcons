package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Resize16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Resize16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.5f, 2f)
            horizontalLineToRelative(-2f)
            curveTo(3.12f, 2f, 2f, 3.12f, 2f, 4.5f)
            curveTo(2f, 4.776f, 2.224f, 5f, 2.5f, 5f)
            reflectiveCurveTo(3f, 4.776f, 3f, 4.5f)
            curveTo(3f, 3.672f, 3.672f, 3f, 4.5f, 3f)
            horizontalLineToRelative(2f)
            curveTo(6.776f, 3f, 7f, 2.776f, 7f, 2.5f)
            reflectiveCurveTo(6.776f, 2f, 6.5f, 2f)
            close()
            moveTo(2f, 11.5f)
            curveTo(2f, 12.88f, 3.12f, 14f, 4.5f, 14f)
            horizontalLineToRelative(3f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-3f)
            curveTo(10f, 7.12f, 8.88f, 6f, 7.5f, 6f)
            horizontalLineToRelative(-3f)
            curveTo(3.12f, 6f, 2f, 7.12f, 2f, 8.5f)
            verticalLineToRelative(3f)
            close()
            moveToRelative(9.5f, 2.5f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            reflectiveCurveToRelative(0.224f, -0.5f, 0.5f, -0.5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-2f)
            curveTo(13f, 9.224f, 13.224f, 9f, 13.5f, 9f)
            reflectiveCurveTo(14f, 9.224f, 14f, 9.5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            close()
            moveTo(14f, 6.5f)
            curveTo(14f, 6.776f, 13.776f, 7f, 13.5f, 7f)
            reflectiveCurveTo(13f, 6.776f, 13f, 6.5f)
            verticalLineToRelative(-2f)
            curveTo(13f, 3.672f, 12.328f, 3f, 11.5f, 3f)
            horizontalLineToRelative(-2f)
            curveTo(9.224f, 3f, 9f, 2.776f, 9f, 2.5f)
            reflectiveCurveTo(9.224f, 2f, 9.5f, 2f)
            horizontalLineToRelative(2f)
            curveTo(12.88f, 2f, 14f, 3.12f, 14f, 4.5f)
            verticalLineToRelative(2f)
            close()
        }
    }.build()
}
