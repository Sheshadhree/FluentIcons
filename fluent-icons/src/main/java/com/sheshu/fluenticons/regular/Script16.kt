package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Script16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Script16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13f, 1f)
            horizontalLineTo(5.5f)
            curveTo(4.121f, 1f, 3f, 2.122f, 3f, 3.5f)
            verticalLineTo(11f)
            horizontalLineTo(2f)
            curveToRelative(-0.552f, 0f, -1f, 0.449f, -1f, 1f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 1.103f, 0.897f, 2f, 2f, 2f)
            horizontalLineToRelative(7f)
            curveToRelative(1.103f, 0f, 2f, -0.897f, 2f, -2f)
            verticalLineTo(5f)
            horizontalLineToRelative(2f)
            curveToRelative(0.552f, 0f, 1f, -0.449f, 1f, -1f)
            verticalLineTo(3f)
            curveToRelative(0f, -1.103f, -0.897f, -2f, -2f, -2f)
            close()
            moveTo(3f, 14f)
            curveToRelative(-0.552f, 0f, -1f, -0.449f, -1f, -1f)
            verticalLineToRelative(-1f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.364f, 0.098f, 0.706f, 0.269f, 1f)
            horizontalLineTo(3f)
            close()
            moveToRelative(8f, -1f)
            curveToRelative(0f, 0.551f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.449f, -1f, -1f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -0.551f, -0.448f, -1f, -1f, -1f)
            horizontalLineTo(4f)
            verticalLineTo(3.5f)
            curveTo(4f, 2.673f, 4.673f, 2f, 5.5f, 2f)
            horizontalLineToRelative(5.769f)
            curveTo(11.098f, 2.294f, 11f, 2.636f, 11f, 3f)
            verticalLineToRelative(10f)
            close()
            moveToRelative(3f, -9f)
            horizontalLineToRelative(-2f)
            verticalLineTo(3f)
            curveToRelative(0f, -0.551f, 0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.449f, 1f, 1f)
            verticalLineToRelative(1f)
            close()
        }
    }.build()
}
