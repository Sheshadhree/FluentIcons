package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ColumnSingleCompare16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ColumnSingleCompare16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 2.75f)
            curveTo(3f, 1.784f, 3.784f, 1f, 4.75f, 1f)
            horizontalLineToRelative(6.5f)
            curveTo(12.216f, 1f, 13f, 1.784f, 13f, 2.75f)
            verticalLineToRelative(10.5f)
            curveToRelative(0f, 0.966f, -0.784f, 1.75f, -1.75f, 1.75f)
            horizontalLineToRelative(-6.5f)
            curveTo(3.784f, 15f, 3f, 14.216f, 3f, 13.25f)
            verticalLineTo(2.75f)
            close()
            moveTo(4.75f, 2f)
            curveTo(4.336f, 2f, 4f, 2.336f, 4f, 2.75f)
            verticalLineTo(5f)
            horizontalLineToRelative(8f)
            verticalLineTo(2.75f)
            curveTo(12f, 2.336f, 11.664f, 2f, 11.25f, 2f)
            horizontalLineToRelative(-6.5f)
            close()
            moveTo(4f, 9f)
            horizontalLineToRelative(8f)
            verticalLineTo(6f)
            horizontalLineTo(4f)
            verticalLineToRelative(3f)
            close()
            moveToRelative(0f, 2f)
            verticalLineToRelative(2.25f)
            curveTo(4f, 13.664f, 4.336f, 14f, 4.75f, 14f)
            horizontalLineToRelative(6.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(11f)
            horizontalLineTo(4f)
            close()
        }
    }.build()
}
