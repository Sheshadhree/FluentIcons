package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.DataHistogram24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DataHistogram24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.5f, 5.23f)
            curveToRelative(0f, -1.242f, 1.007f, -2.25f, 2.25f, -2.25f)
            horizontalLineToRelative(2.5f)
            curveToRelative(1.243f, 0f, 2.25f, 1.008f, 2.25f, 2.25f)
            verticalLineTo(7f)
            horizontalLineToRelative(3.25f)
            curveTo(19.993f, 7f, 21f, 8.008f, 21f, 9.25f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 0.415f, -0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineTo(3.75f)
            curveTo(3.336f, 21f, 3f, 20.665f, 3f, 20.25f)
            verticalLineToRelative(-8f)
            curveTo(3f, 11.009f, 4.007f, 10f, 5.25f, 10f)
            horizontalLineTo(8.5f)
            verticalLineTo(5.23f)
            close()
            moveTo(10f, 19.5f)
            horizontalLineToRelative(4f)
            verticalLineTo(5.23f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineToRelative(-2.5f)
            curveTo(10.336f, 4.48f, 10f, 4.817f, 10f, 5.23f)
            verticalLineTo(19.5f)
            close()
            moveToRelative(-1.5f, -8f)
            horizontalLineTo(5.25f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            verticalLineToRelative(7.25f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(-8f)
            close()
            moveToRelative(7f, 8f)
            horizontalLineToRelative(4f)
            verticalLineTo(9.25f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineTo(15.5f)
            verticalLineToRelative(11f)
            close()
        }
    }.build()
}
