package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TextUnderline20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextUnderline20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.5f, 3.75f)
            curveTo(6.5f, 3.336f, 6.164f, 3f, 5.75f, 3f)
            reflectiveCurveTo(5f, 3.336f, 5f, 3.75f)
            verticalLineTo(9f)
            curveToRelative(0f, 1.367f, 0.339f, 2.736f, 1.16f, 3.78f)
            curveToRelative(0.843f, 1.07f, 2.132f, 1.72f, 3.84f, 1.72f)
            curveToRelative(1.708f, 0f, 2.997f, -0.65f, 3.84f, -1.72f)
            curveTo(14.66f, 11.736f, 15f, 10.367f, 15f, 9f)
            verticalLineTo(3.75f)
            curveTo(15f, 3.336f, 14.664f, 3f, 14.25f, 3f)
            reflectiveCurveTo(13.5f, 3.336f, 13.5f, 3.75f)
            verticalLineTo(9f)
            curveToRelative(0f, 1.143f, -0.286f, 2.15f, -0.84f, 2.853f)
            curveTo(12.129f, 12.529f, 11.293f, 13f, 10f, 13f)
            reflectiveCurveToRelative(-2.128f, -0.47f, -2.66f, -1.147f)
            curveTo(6.785f, 11.149f, 6.5f, 10.143f, 6.5f, 9f)
            verticalLineTo(3.75f)
            close()
            moveTo(5.75f, 15.5f)
            curveTo(5.336f, 15.5f, 5f, 15.836f, 5f, 16.25f)
            reflectiveCurveTo(5.336f, 17f, 5.75f, 17f)
            horizontalLineToRelative(8.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineToRelative(-8.5f)
            close()
        }
    }.build()
}
