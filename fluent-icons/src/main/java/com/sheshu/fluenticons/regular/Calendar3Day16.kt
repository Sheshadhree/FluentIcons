package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Calendar3Day16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Calendar3Day16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 5.5f)
            curveTo(6f, 5.224f, 5.776f, 5f, 5.5f, 5f)
            reflectiveCurveTo(5f, 5.224f, 5f, 5.5f)
            verticalLineToRelative(5f)
            curveTo(5f, 10.776f, 5.224f, 11f, 5.5f, 11f)
            reflectiveCurveTo(6f, 10.776f, 6f, 10.5f)
            verticalLineToRelative(-5f)
            close()
            moveToRelative(2.5f, 0f)
            curveTo(8.5f, 5.224f, 8.276f, 5f, 8f, 5f)
            reflectiveCurveTo(7.5f, 5.224f, 7.5f, 5.5f)
            verticalLineToRelative(5f)
            curveTo(7.5f, 10.776f, 7.724f, 11f, 8f, 11f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-5f)
            close()
            moveToRelative(2.5f, 0f)
            curveTo(11f, 5.224f, 10.776f, 5f, 10.5f, 5f)
            reflectiveCurveTo(10f, 5.224f, 10f, 5.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-5f)
            close()
            moveToRelative(3f, -1f)
            curveTo(14f, 3.12f, 12.88f, 2f, 11.5f, 2f)
            horizontalLineToRelative(-7f)
            curveTo(3.12f, 2f, 2f, 3.12f, 2f, 4.5f)
            verticalLineToRelative(7f)
            curveTo(2f, 12.88f, 3.12f, 14f, 4.5f, 14f)
            horizontalLineToRelative(7f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-7f)
            close()
            moveToRelative(-11f, 7f)
            verticalLineToRelative(-7f)
            curveTo(3f, 3.672f, 3.672f, 3f, 4.5f, 3f)
            horizontalLineToRelative(7f)
            curveTo(12.328f, 3f, 13f, 3.672f, 13f, 4.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-7f)
            curveTo(3.672f, 13f, 3f, 12.328f, 3f, 11.5f)
            close()
        }
    }.build()
}
