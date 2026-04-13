package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Wallet24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Wallet24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 5f)
            verticalLineToRelative(12.75f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineToRelative(12f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineToRelative(-8.5f)
            curveToRelative(0f, -1.537f, -1.067f, -2.824f, -2.5f, -3.163f)
            verticalLineTo(5.25f)
            curveTo(19f, 4.007f, 17.993f, 3f, 16.75f, 3f)
            horizontalLineTo(5.25f)
            curveTo(4.092f, 3f, 3.138f, 3.875f, 3.014f, 5f)
            horizontalLineTo(3f)
            close()
            moveToRelative(2.25f, 1f)
            curveTo(4.836f, 6f, 4.5f, 5.664f, 4.5f, 5.25f)
            reflectiveCurveTo(4.836f, 4.5f, 5.25f, 4.5f)
            horizontalLineToRelative(11.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineTo(6f)
            horizontalLineTo(5.25f)
            close()
            moveToRelative(11f, 7f)
            horizontalLineToRelative(2f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            reflectiveCurveTo(15.836f, 13f, 16.25f, 13f)
            close()
        }
    }.build()
}
