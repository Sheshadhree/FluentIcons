package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ColumnSingle16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ColumnSingle16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.75f, 2f)
            curveTo(4.784f, 2f, 4f, 2.784f, 4f, 3.75f)
            verticalLineToRelative(8.5f)
            curveTo(4f, 13.216f, 4.784f, 14f, 5.75f, 14f)
            horizontalLineToRelative(3.5f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineToRelative(-8.5f)
            curveTo(11f, 2.784f, 10.216f, 2f, 9.25f, 2f)
            horizontalLineToRelative(-3.5f)
            close()
            moveTo(5f, 3.75f)
            curveTo(5f, 3.336f, 5.336f, 3f, 5.75f, 3f)
            horizontalLineToRelative(3.5f)
            curveTo(9.664f, 3f, 10f, 3.336f, 10f, 3.75f)
            verticalLineTo(5f)
            horizontalLineTo(5f)
            verticalLineTo(3.75f)
            close()
            moveTo(5f, 6f)
            horizontalLineToRelative(5f)
            verticalLineToRelative(6.25f)
            curveTo(10f, 12.664f, 9.664f, 13f, 9.25f, 13f)
            horizontalLineToRelative(-3.5f)
            curveTo(5.336f, 13f, 5f, 12.664f, 5f, 12.25f)
            verticalLineTo(6f)
            close()
        }
    }.build()
}
