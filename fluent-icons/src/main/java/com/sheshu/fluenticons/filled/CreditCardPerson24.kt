package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CreditCardPerson24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CreditCardPerson24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.25f, 5f)
            curveTo(3.455f, 5f, 2f, 6.455f, 2f, 8.25f)
            verticalLineTo(9.5f)
            horizontalLineToRelative(20f)
            verticalLineTo(8.25f)
            curveTo(22f, 6.455f, 20.545f, 5f, 18.75f, 5f)
            horizontalLineTo(5.25f)
            close()
            moveTo(2f, 15.75f)
            verticalLineTo(11f)
            horizontalLineToRelative(16.5f)
            curveToRelative(-1.933f, 0f, -3.5f, 1.567f, -3.5f, 3.5f)
            curveToRelative(0f, 0.98f, 0.402f, 1.865f, 1.05f, 2.5f)
            horizontalLineToRelative(-0.277f)
            curveToRelative(-1.263f, 0f, -2.33f, 0.844f, -2.664f, 2f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 19f, 2f, 17.545f, 2f, 15.75f)
            close()
            moveToRelative(19f, -1.25f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveTo(16f, 15.88f, 16f, 14.5f)
            reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            close()
            moveToRelative(2f, 5.375f)
            curveTo(23f, 21.431f, 21.714f, 23f, 18.5f, 23f)
            reflectiveCurveTo(14f, 21.437f, 14f, 19.875f)
            verticalLineToRelative(-0.103f)
            curveTo(14f, 18.792f, 14.794f, 18f, 15.773f, 18f)
            horizontalLineToRelative(5.454f)
            curveTo(22.207f, 18f, 23f, 18.793f, 23f, 19.772f)
            verticalLineToRelative(0.103f)
            close()
        }
    }.build()
}
