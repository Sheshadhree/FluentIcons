package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Textbox16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Textbox16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.5f, 5f)
            curveTo(5.224f, 5f, 5f, 5.224f, 5f, 5.5f)
            reflectiveCurveTo(5.224f, 6f, 5.5f, 6f)
            horizontalLineToRelative(5f)
            curveTo(10.776f, 6f, 11f, 5.776f, 11f, 5.5f)
            reflectiveCurveTo(10.776f, 5f, 10.5f, 5f)
            horizontalLineToRelative(-5f)
            close()
            moveToRelative(0f, 2.5f)
            curveTo(5.224f, 7.5f, 5f, 7.724f, 5f, 8f)
            reflectiveCurveToRelative(0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(3f)
            curveTo(8.776f, 8.5f, 9f, 8.276f, 9f, 8f)
            reflectiveCurveTo(8.776f, 7.5f, 8.5f, 7.5f)
            horizontalLineToRelative(-3f)
            close()
            moveToRelative(0f, 2.5f)
            curveTo(5.224f, 10f, 5f, 10.224f, 5f, 10.5f)
            reflectiveCurveTo(5.224f, 11f, 5.5f, 11f)
            horizontalLineToRelative(5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(10.776f, 10f, 10.5f, 10f)
            horizontalLineToRelative(-5f)
            close()
            moveToRelative(-1f, -8f)
            curveTo(3.12f, 2f, 2f, 3.12f, 2f, 4.5f)
            verticalLineToRelative(7f)
            curveTo(2f, 12.88f, 3.12f, 14f, 4.5f, 14f)
            horizontalLineToRelative(7f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-7f)
            curveTo(14f, 3.12f, 12.88f, 2f, 11.5f, 2f)
            horizontalLineToRelative(-7f)
            close()
            moveTo(3f, 4.5f)
            curveTo(3f, 3.672f, 3.672f, 3f, 4.5f, 3f)
            horizontalLineToRelative(7f)
            curveTo(12.328f, 3f, 13f, 3.672f, 13f, 4.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-7f)
            curveTo(3.672f, 13f, 3f, 12.328f, 3f, 11.5f)
            verticalLineToRelative(-7f)
            close()
        }
    }.build()
}
