package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Receipt16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Receipt16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.75f, 2f)
            curveTo(2.784f, 2f, 2f, 2.784f, 2f, 3.75f)
            verticalLineToRelative(7.75f)
            curveTo(2f, 12.88f, 3.12f, 14f, 4.5f, 14f)
            horizontalLineToRelative(7f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineTo(10f)
            horizontalLineToRelative(-3f)
            verticalLineTo(3.75f)
            curveTo(11f, 2.784f, 10.216f, 2f, 9.25f, 2f)
            horizontalLineToRelative(-5.5f)
            close()
            moveTo(11f, 11f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineTo(11f)
            verticalLineToRelative(-2f)
            close()
            moveTo(3f, 3.75f)
            curveTo(3f, 3.336f, 3.336f, 3f, 3.75f, 3f)
            horizontalLineToRelative(5.5f)
            curveTo(9.664f, 3f, 10f, 3.336f, 10f, 3.75f)
            verticalLineTo(13f)
            horizontalLineTo(4.5f)
            curveTo(3.672f, 13f, 3f, 12.328f, 3f, 11.5f)
            verticalLineTo(3.75f)
            close()
            moveTo(4.5f, 5.5f)
            curveTo(4.5f, 5.224f, 4.724f, 5f, 5f, 5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(8.276f, 6f, 8f, 6f)
            horizontalLineTo(5f)
            curveTo(4.724f, 6f, 4.5f, 5.776f, 4.5f, 5.5f)
            close()
            moveToRelative(0f, 2.5f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(8.276f, 8.5f, 8f, 8.5f)
            horizontalLineTo(5f)
            curveTo(4.724f, 8.5f, 4.5f, 8.276f, 4.5f, 8f)
            close()
            moveTo(5f, 10f)
            curveToRelative(-0.276f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
            reflectiveCurveTo(4.724f, 11f, 5f, 11f)
            horizontalLineToRelative(1.5f)
            curveTo(6.776f, 11f, 7f, 10.776f, 7f, 10.5f)
            reflectiveCurveTo(6.776f, 10f, 6.5f, 10f)
            horizontalLineTo(5f)
            close()
        }
    }.build()
}
