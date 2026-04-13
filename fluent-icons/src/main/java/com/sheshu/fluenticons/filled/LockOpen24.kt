package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LockOpen24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LockOpen24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveTo(21f, 3.62f, 21f, 5f)
            verticalLineToRelative(0.25f)
            curveTo(21f, 5.664f, 21.336f, 6f, 21.75f, 6f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(5f)
            curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
            reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
            verticalLineToRelative(2f)
            horizontalLineTo(7.25f)
            curveTo(5.455f, 7f, 4f, 8.455f, 4f, 10.25f)
            verticalLineToRelative(7.5f)
            curveTo(4f, 19.545f, 5.455f, 21f, 7.25f, 21f)
            horizontalLineToRelative(9.5f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineToRelative(-7.5f)
            curveTo(20f, 8.455f, 18.545f, 7f, 16.75f, 7f)
            horizontalLineTo(16f)
            verticalLineTo(5f)
            close()
            moveToRelative(-4f, 10.5f)
            curveToRelative(-0.828f, 0f, -1.5f, -0.672f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
            close()
        }
    }.build()
}
