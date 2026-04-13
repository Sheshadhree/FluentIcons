package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ShareScreenPerson24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ShareScreenPerson24",
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
            curveToRelative(0f, -0.459f, 0.111f, -0.891f, 0.308f, -1.272f)
            horizontalLineTo(5.25f)
            curveToRelative(-0.966f, 0f, -1.75f, -0.784f, -1.75f, -1.75f)
            verticalLineToRelative(-9.5f)
            curveToRelative(0f, -0.966f, 0.784f, -1.75f, 1.75f, -1.75f)
            horizontalLineToRelative(13.5f)
            curveToRelative(0.966f, 0f, 1.75f, 0.784f, 1.75f, 1.75f)
            verticalLineToRelative(4.377f)
            curveTo(21.407f, 12.26f, 22f, 13.311f, 22f, 14.5f)
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
