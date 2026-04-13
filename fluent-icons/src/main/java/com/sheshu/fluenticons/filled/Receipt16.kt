package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Receipt16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Receipt16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 3.75f)
            curveTo(2f, 2.784f, 2.784f, 2f, 3.75f, 2f)
            horizontalLineToRelative(5.5f)
            curveTo(10.216f, 2f, 11f, 2.784f, 11f, 3.75f)
            verticalLineTo(10f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-7f)
            curveTo(3.12f, 14f, 2f, 12.88f, 2f, 11.5f)
            verticalLineTo(3.75f)
            close()
            moveTo(11f, 13f)
            horizontalLineToRelative(0.5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineTo(11f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(2f)
            close()
            moveTo(4.5f, 5.5f)
            curveTo(4.5f, 5.776f, 4.724f, 6f, 5f, 6f)
            horizontalLineToRelative(3f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(8.276f, 5f, 8f, 5f)
            horizontalLineTo(5f)
            curveTo(4.724f, 5f, 4.5f, 5.224f, 4.5f, 5.5f)
            close()
            moveToRelative(0.5f, 2f)
            curveTo(4.724f, 7.5f, 4.5f, 7.724f, 4.5f, 8f)
            reflectiveCurveTo(4.724f, 8.5f, 5f, 8.5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(8.276f, 7.5f, 8f, 7.5f)
            horizontalLineTo(5f)
            close()
            moveToRelative(-0.5f, 3f)
            curveTo(4.5f, 10.776f, 4.724f, 11f, 5f, 11f)
            horizontalLineToRelative(1.5f)
            curveTo(6.776f, 11f, 7f, 10.776f, 7f, 10.5f)
            reflectiveCurveTo(6.776f, 10f, 6.5f, 10f)
            horizontalLineTo(5f)
            curveToRelative(-0.276f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
            close()
        }
    }.build()
}
