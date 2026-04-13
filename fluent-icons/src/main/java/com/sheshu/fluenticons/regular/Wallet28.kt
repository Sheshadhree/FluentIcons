package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Wallet28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Wallet28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.75f, 16f)
            curveTo(18.336f, 16f, 18f, 16.336f, 18f, 16.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(2.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(21.664f, 16f, 21.25f, 16f)
            horizontalLineToRelative(-2.5f)
            close()
            moveTo(3f, 5.75f)
            curveTo(3f, 4.231f, 4.231f, 3f, 5.75f, 3f)
            horizontalLineToRelative(13.5f)
            curveTo(20.769f, 3f, 22f, 4.231f, 22f, 5.75f)
            verticalLineToRelative(1.258f)
            curveToRelative(1.954f, 0.129f, 3.5f, 1.755f, 3.5f, 3.742f)
            verticalLineToRelative(10.5f)
            curveToRelative(0f, 2.071f, -1.68f, 3.75f, -3.75f, 3.75f)
            horizontalLineTo(6.754f)
            curveToRelative(-2.071f, 0f, -3.75f, -1.679f, -3.75f, -3.75f)
            verticalLineToRelative(-10.5f)
            horizontalLineTo(3f)
            verticalLineTo(6f)
            horizontalLineToRelative(0.011f)
            curveTo(3.004f, 5.918f, 3f, 5.834f, 3f, 5.75f)
            close()
            moveTo(21.75f, 8.5f)
            horizontalLineTo(4.504f)
            verticalLineToRelative(12.75f)
            curveToRelative(0f, 1.243f, 1.007f, 2.25f, 2.25f, 2.25f)
            horizontalLineTo(21.75f)
            curveToRelative(1.242f, 0f, 2.25f, -1.007f, 2.25f, -2.25f)
            verticalLineToRelative(-10.5f)
            curveToRelative(0f, -1.243f, -1.008f, -2.25f, -2.25f, -2.25f)
            close()
            moveTo(20.5f, 5.75f)
            curveToRelative(0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
            horizontalLineTo(5.75f)
            curveTo(5.06f, 4.5f, 4.5f, 5.06f, 4.5f, 5.75f)
            reflectiveCurveTo(5.06f, 7f, 5.75f, 7f)
            horizontalLineTo(20.5f)
            verticalLineTo(5.75f)
            close()
        }
    }.build()
}
