package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.History20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.History20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 4f)
            curveToRelative(3.314f, 0f, 6f, 2.686f, 6f, 6f)
            reflectiveCurveToRelative(-2.686f, 6f, -6f, 6f)
            reflectiveCurveToRelative(-6f, -2.686f, -6f, -6f)
            curveToRelative(0f, -0.075f, 0.001f, -0.149f, 0.004f, -0.223f)
            curveTo(4.019f, 9.363f, 3.696f, 9.016f, 3.282f, 9f)
            curveTo(2.868f, 8.985f, 2.52f, 9.31f, 2.505f, 9.723f)
            curveTo(2.502f, 9.815f, 2.5f, 9.907f, 2.5f, 10f)
            curveToRelative(0f, 4.142f, 3.358f, 7.5f, 7.5f, 7.5f)
            curveToRelative(4.142f, 0f, 7.5f, -3.358f, 7.5f, -7.5f)
            curveToRelative(0f, -4.142f, -3.358f, -7.5f, -7.5f, -7.5f)
            curveToRelative(-1.921f, 0f, -3.674f, 0.723f, -5f, 1.91f)
            verticalLineTo(3.25f)
            curveTo(5f, 2.836f, 4.664f, 2.5f, 4.25f, 2.5f)
            reflectiveCurveTo(3.5f, 2.836f, 3.5f, 3.25f)
            verticalLineToRelative(3f)
            curveTo(3.5f, 6.664f, 3.836f, 7f, 4.25f, 7f)
            horizontalLineToRelative(3f)
            curveTo(7.664f, 7f, 8f, 6.664f, 8f, 6.25f)
            reflectiveCurveTo(7.664f, 5.5f, 7.25f, 5.5f)
            horizontalLineTo(6.031f)
            curveTo(7.09f, 4.566f, 8.48f, 4f, 10f, 4f)
            close()
            moveToRelative(0.5f, 2.25f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            reflectiveCurveTo(9f, 5.836f, 9f, 6.25f)
            verticalLineToRelative(4f)
            curveTo(9f, 10.664f, 9.336f, 11f, 9.75f, 11f)
            horizontalLineToRelative(3f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(13.164f, 9.5f, 12.75f, 9.5f)
            horizontalLineTo(10.5f)
            verticalLineTo(6.25f)
            close()
        }
    }.build()
}
