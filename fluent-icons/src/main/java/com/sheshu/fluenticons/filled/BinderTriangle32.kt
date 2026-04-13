package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.BinderTriangle32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BinderTriangle32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.25f, 2f)
            curveTo(4.455f, 2f, 3f, 3.455f, 3f, 5.25f)
            verticalLineTo(6f)
            horizontalLineTo(2f)
            curveTo(1.448f, 6f, 1f, 6.448f, 1f, 7f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(5f)
            horizontalLineTo(2f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(5f)
            horizontalLineTo(2f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(0.75f)
            curveTo(3f, 24.545f, 4.455f, 26f, 6.25f, 26f)
            horizontalLineToRelative(1.446f)
            lineTo(23f, 8.14f)
            verticalLineTo(5.25f)
            curveTo(23f, 3.455f, 21.545f, 2f, 19.75f, 2f)
            horizontalLineTo(6.25f)
            close()
            moveTo(10f, 9f)
            horizontalLineToRelative(6f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            horizontalLineToRelative(-6f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            close()
            moveToRelative(18.996f, -1.497f)
            curveToRelative(0f, -1.393f, -1.733f, -2.034f, -2.639f, -0.976f)
            lineTo(8.364f, 27.526f)
            curveToRelative(-0.834f, 0.973f, -0.143f, 2.476f, 1.139f, 2.476f)
            horizontalLineToRelative(16.243f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineTo(7.503f)
            close()
            moveTo(23.12f, 17.971f)
            curveTo(23.422f, 17.62f, 24f, 17.832f, 24f, 18.297f)
            verticalLineTo(24f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineToRelative(-4.816f)
            curveToRelative(-0.427f, 0f, -0.657f, -0.5f, -0.38f, -0.825f)
            lineToRelative(5.316f, -6.204f)
            close()
        }
    }.build()
}
