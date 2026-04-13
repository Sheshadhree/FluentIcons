package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Bench24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Bench24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.75f, 4f)
            curveTo(4.231f, 4f, 3f, 5.231f, 3f, 6.75f)
            verticalLineToRelative(5.3f)
            curveToRelative(-1.141f, 0.232f, -2f, 1.24f, -2f, 2.45f)
            curveToRelative(0f, 1.21f, 0.859f, 2.218f, 2f, 2.45f)
            verticalLineToRelative(2.3f)
            curveTo(3f, 19.664f, 3.336f, 20f, 3.75f, 20f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(17f)
            horizontalLineToRelative(15f)
            verticalLineToRelative(2.25f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveTo(21f, 19.664f, 21f, 19.25f)
            verticalLineToRelative(-2.3f)
            curveToRelative(1.141f, -0.232f, 2f, -1.24f, 2f, -2.45f)
            curveToRelative(0f, -1.21f, -0.859f, -2.218f, -2f, -2.45f)
            verticalLineToRelative(-5.3f)
            curveTo(21f, 5.231f, 19.769f, 4f, 18.25f, 4f)
            horizontalLineTo(5.75f)
            close()
            moveToRelative(13.75f, 8f)
            horizontalLineToRelative(-15f)
            verticalLineTo(6.75f)
            curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
            horizontalLineToRelative(12.5f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            verticalLineTo(12f)
            close()
            moveToRelative(1f, 3.5f)
            horizontalLineToRelative(-17f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(17f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            close()
        }
    }.build()
}
