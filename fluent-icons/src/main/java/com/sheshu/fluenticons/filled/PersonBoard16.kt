package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PersonBoard16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonBoard16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 2f)
            curveTo(3.12f, 2f, 2f, 3.12f, 2f, 4.5f)
            verticalLineToRelative(5f)
            curveTo(2f, 10.88f, 3.12f, 12f, 4.5f, 12f)
            horizontalLineToRelative(5f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-5f)
            curveTo(12f, 3.12f, 10.88f, 2f, 9.5f, 2f)
            horizontalLineToRelative(-5f)
            close()
            moveTo(7f, 6.5f)
            curveTo(6.172f, 6.5f, 5.5f, 5.828f, 5.5f, 5f)
            reflectiveCurveTo(6.172f, 3.5f, 7f, 3.5f)
            reflectiveCurveTo(8.5f, 4.172f, 8.5f, 5f)
            reflectiveCurveTo(7.828f, 6.5f, 7f, 6.5f)
            close()
            moveTo(5.25f, 7.125f)
            horizontalLineToRelative(3.5f)
            curveToRelative(0.621f, 0f, 1.125f, 0.504f, 1.125f, 1.125f)
            verticalLineTo(8.5f)
            curveToRelative(0f, 0.4f, -0.171f, 0.886f, -0.64f, 1.263f)
            curveToRelative(-0.464f, 0.372f, -1.184f, 0.612f, -2.237f, 0.612f)
            curveToRelative(-1.055f, 0f, -1.774f, -0.245f, -2.236f, -0.62f)
            curveTo(4.296f, 9.377f, 4.125f, 8.893f, 4.125f, 8.5f)
            verticalLineTo(8.25f)
            curveToRelative(0f, -0.622f, 0.504f, -1.125f, 1.125f, -1.125f)
            close()
            moveTo(4.5f, 13f)
            curveToRelative(0.456f, 0.607f, 1.182f, 1f, 2f, 1f)
            horizontalLineToRelative(3f)
            curveToRelative(2.485f, 0f, 4.5f, -2.015f, 4.5f, -4.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.818f, -0.393f, -1.544f, -1f, -2f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            horizontalLineToRelative(-5f)
            close()
        }
    }.build()
}
