package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.AppsAddIn32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.AppsAddIn32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(25f, 3.5f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.448f, -1f, 1f)
            verticalLineTo(7f)
            horizontalLineToRelative(-3.5f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            horizontalLineTo(23f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            verticalLineTo(9f)
            horizontalLineToRelative(3.5f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineTo(25f)
            verticalLineTo(3.5f)
            close()
            moveTo(5f, 6.25f)
            verticalLineTo(15f)
            horizontalLineToRelative(10f)
            verticalLineTo(6.25f)
            curveTo(15f, 5.56f, 14.44f, 5f, 13.75f, 5f)
            horizontalLineToRelative(-7.5f)
            curveTo(5.56f, 5f, 5f, 5.56f, 5f, 6.25f)
            close()
            moveToRelative(12f, 0f)
            verticalLineTo(15f)
            horizontalLineToRelative(8.75f)
            curveToRelative(1.795f, 0f, 3.25f, 1.455f, 3.25f, 3.25f)
            verticalLineToRelative(7.5f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 29f, 3f, 27.545f, 3f, 25.75f)
            verticalLineTo(6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineToRelative(7.5f)
            curveTo(15.545f, 3f, 17f, 4.455f, 17f, 6.25f)
            close()
            moveTo(5f, 17f)
            verticalLineToRelative(8.75f)
            curveTo(5f, 26.44f, 5.56f, 27f, 6.25f, 27f)
            horizontalLineTo(15f)
            verticalLineTo(17f)
            horizontalLineTo(5f)
            close()
            moveToRelative(12f, 0f)
            verticalLineToRelative(10f)
            horizontalLineToRelative(8.75f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            verticalLineToRelative(-7.5f)
            curveToRelative(0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
            horizontalLineTo(17f)
            close()
        }
    }.build()
}
