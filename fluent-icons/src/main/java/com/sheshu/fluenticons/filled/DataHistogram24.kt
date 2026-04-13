package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DataHistogram24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DataHistogram24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9f, 5.23f)
            curveToRelative(0f, -1.242f, 1.007f, -2.25f, 2.25f, -2.25f)
            horizontalLineToRelative(1.5f)
            curveToRelative(1.243f, 0f, 2.25f, 1.008f, 2.25f, 2.25f)
            verticalLineTo(21f)
            horizontalLineTo(9f)
            verticalLineTo(5.23f)
            close()
            moveTo(7.5f, 10f)
            horizontalLineTo(5.25f)
            curveTo(4.007f, 10f, 3f, 11.009f, 3f, 12.25f)
            verticalLineToRelative(8f)
            curveTo(3f, 20.665f, 3.336f, 21f, 3.75f, 21f)
            horizontalLineTo(7.5f)
            verticalLineTo(10f)
            close()
            moveToRelative(9f, 11f)
            horizontalLineToRelative(3.75f)
            curveToRelative(0.414f, 0f, 0.75f, -0.335f, 0.75f, -0.75f)
            verticalLineToRelative(-11f)
            curveTo(21f, 8.009f, 19.993f, 7f, 18.75f, 7f)
            horizontalLineTo(16.5f)
            verticalLineToRelative(14f)
            close()
        }
    }.build()
}
