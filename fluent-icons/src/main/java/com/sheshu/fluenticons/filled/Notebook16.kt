package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Notebook16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Notebook16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.75f, 1f)
            curveTo(2.784f, 1f, 2f, 1.784f, 2f, 2.75f)
            verticalLineToRelative(10.5f)
            curveTo(2f, 14.216f, 2.784f, 15f, 3.75f, 15f)
            horizontalLineToRelative(7.5f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineTo(2.75f)
            curveTo(13f, 1.784f, 12.216f, 1f, 11.25f, 1f)
            horizontalLineToRelative(-7.5f)
            close()
            moveTo(4f, 3.75f)
            curveTo(4f, 3.336f, 4.336f, 3f, 4.75f, 3f)
            horizontalLineToRelative(5.5f)
            curveTo(10.664f, 3f, 11f, 3.336f, 11f, 3.75f)
            verticalLineToRelative(0.5f)
            curveTo(11f, 4.664f, 10.664f, 5f, 10.25f, 5f)
            horizontalLineToRelative(-5.5f)
            curveTo(4.336f, 5f, 4f, 4.664f, 4f, 4.25f)
            verticalLineToRelative(-0.5f)
            close()
            moveTo(14f, 4f)
            horizontalLineToRelative(0.625f)
            curveTo(14.832f, 4f, 15f, 4.168f, 15f, 4.375f)
            verticalLineToRelative(1.25f)
            curveTo(15f, 5.832f, 14.832f, 6f, 14.625f, 6f)
            horizontalLineTo(14f)
            verticalLineTo(4f)
            close()
            moveToRelative(0.625f, 3f)
            horizontalLineTo(14f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(0.625f)
            curveTo(14.832f, 9f, 15f, 8.832f, 15f, 8.625f)
            verticalLineToRelative(-1.25f)
            curveTo(15f, 7.168f, 14.832f, 7f, 14.625f, 7f)
            close()
            moveTo(14f, 10f)
            horizontalLineToRelative(0.625f)
            curveTo(14.832f, 10f, 15f, 10.168f, 15f, 10.375f)
            verticalLineToRelative(1.25f)
            curveTo(15f, 11.832f, 14.832f, 12f, 14.625f, 12f)
            horizontalLineTo(14f)
            verticalLineToRelative(-2f)
            close()
        }
    }.build()
}
