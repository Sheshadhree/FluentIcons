package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ShareScreenPerson24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ShareScreenPerson24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.25f, 4f)
            curveTo(3.455f, 4f, 2f, 5.455f, 2f, 7.25f)
            verticalLineToRelative(9.5f)
            curveTo(2f, 18.545f, 3.455f, 20f, 5.25f, 20f)
            horizontalLineToRelative(7.752f)
            lineTo(13f, 19.875f)
            verticalLineToRelative(-0.103f)
            curveTo(13f, 18.24f, 14.242f, 17f, 15.773f, 17f)
            horizontalLineToRelative(0.277f)
            curveTo(15.402f, 16.365f, 15f, 15.48f, 15f, 14.5f)
            curveToRelative(0f, -1.933f, 1.567f, -3.5f, 3.5f, -3.5f)
            reflectiveCurveToRelative(3.5f, 1.567f, 3.5f, 3.5f)
            verticalLineTo(7.25f)
            curveTo(22f, 5.455f, 20.545f, 4f, 18.75f, 4f)
            horizontalLineTo(5.25f)
            close()
            moveTo(21f, 14.5f)
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
