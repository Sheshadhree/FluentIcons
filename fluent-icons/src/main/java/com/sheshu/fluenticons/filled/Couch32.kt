package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Couch32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Couch32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23f, 6f)
            horizontalLineTo(9f)
            curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
            verticalLineToRelative(1.025f)
            curveTo(5.165f, 11.008f, 5.331f, 11f, 5.5f, 11f)
            curveToRelative(2.593f, 0f, 4.725f, 1.973f, 4.975f, 4.5f)
            horizontalLineToRelative(11.05f)
            curveToRelative(0.25f, -2.527f, 2.382f, -4.5f, 4.975f, -4.5f)
            curveToRelative(0.169f, 0f, 0.335f, 0.008f, 0.5f, 0.025f)
            verticalLineTo(10f)
            curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
            close()
            moveToRelative(4f, 6.535f)
            curveToRelative(-0.163f, -0.023f, -0.33f, -0.035f, -0.5f, -0.035f)
            curveToRelative(-1.933f, 0f, -3.5f, 1.567f, -3.5f, 3.5f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(10f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            curveToRelative(0f, -1.933f, -1.567f, -3.5f, -3.5f, -3.5f)
            curveToRelative(-0.17f, 0f, -0.337f, 0.012f, -0.5f, 0.035f)
            curveTo(3.304f, 12.778f, 2f, 14.237f, 2f, 16f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 1.864f, 1.275f, 3.43f, 3f, 3.874f)
            verticalLineTo(26f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(18f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            verticalLineToRelative(-2.126f)
            curveToRelative(1.725f, -0.444f, 3f, -2.01f, 3f, -3.874f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -1.763f, -1.304f, -3.222f, -3f, -3.465f)
            close()
        }
    }.build()
}
