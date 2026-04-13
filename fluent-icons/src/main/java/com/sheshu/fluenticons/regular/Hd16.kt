package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Hd16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Hd16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 5f)
            curveTo(4.776f, 5f, 5f, 5.224f, 5f, 5.5f)
            verticalLineTo(8f)
            horizontalLineToRelative(1.5f)
            verticalLineTo(5.5f)
            curveTo(6.5f, 5.224f, 6.724f, 5f, 7f, 5f)
            reflectiveCurveToRelative(0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineToRelative(5f)
            curveTo(7.5f, 10.776f, 7.276f, 11f, 7f, 11f)
            reflectiveCurveToRelative(-0.5f, -0.224f, -0.5f, -0.5f)
            verticalLineTo(9f)
            horizontalLineTo(5f)
            verticalLineToRelative(1.5f)
            curveTo(5f, 10.776f, 4.776f, 11f, 4.5f, 11f)
            reflectiveCurveTo(4f, 10.776f, 4f, 10.5f)
            verticalLineToRelative(-5f)
            curveTo(4f, 5.224f, 4.224f, 5f, 4.5f, 5f)
            close()
            moveTo(9f, 5f)
            curveTo(8.724f, 5f, 8.5f, 5.224f, 8.5f, 5.5f)
            verticalLineToRelative(5f)
            curveTo(8.5f, 10.776f, 8.724f, 11f, 9f, 11f)
            horizontalLineToRelative(0.417f)
            curveTo(10.843f, 11f, 12f, 9.843f, 12f, 8.417f)
            verticalLineTo(7.583f)
            curveTo(12f, 6.157f, 10.843f, 5f, 9.417f, 5f)
            horizontalLineTo(9f)
            close()
            moveToRelative(2f, 3.417f)
            curveToRelative(0f, 0.846f, -0.664f, 1.537f, -1.5f, 1.58f)
            verticalLineTo(6.003f)
            curveToRelative(0.836f, 0.042f, 1.5f, 0.734f, 1.5f, 1.58f)
            verticalLineToRelative(0.834f)
            close()
            moveTo(2f, 4.5f)
            curveTo(2f, 3.12f, 3.12f, 2f, 4.5f, 2f)
            horizontalLineToRelative(7f)
            curveTo(12.88f, 2f, 14f, 3.12f, 14f, 4.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-7f)
            curveTo(3.12f, 14f, 2f, 12.88f, 2f, 11.5f)
            verticalLineToRelative(-7f)
            close()
            moveTo(4.5f, 3f)
            curveTo(3.672f, 3f, 3f, 3.672f, 3f, 4.5f)
            verticalLineToRelative(7f)
            curveTo(3f, 12.328f, 3.672f, 13f, 4.5f, 13f)
            horizontalLineToRelative(7f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-7f)
            curveTo(13f, 3.672f, 12.328f, 3f, 11.5f, 3f)
            horizontalLineToRelative(-7f)
            close()
        }
    }.build()
}
