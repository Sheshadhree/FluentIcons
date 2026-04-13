package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.DocumentOnePageColumns24: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DocumentOnePageColumns24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 4.25f)
            curveTo(4f, 3.007f, 5.007f, 2f, 6.25f, 2f)
            horizontalLineToRelative(11.5f)
            curveTo(18.993f, 2f, 20f, 3.007f, 20f, 4.25f)
            verticalLineToRelative(15.5f)
            curveToRelative(0f, 1.243f, -1.007f, 2.25f, -2.25f, 2.25f)
            horizontalLineTo(6.25f)
            curveTo(5.007f, 22f, 4f, 20.993f, 4f, 19.75f)
            verticalLineTo(4.25f)
            close()
            moveTo(6.25f, 3.5f)
            curveTo(5.836f, 3.5f, 5.5f, 3.836f, 5.5f, 4.25f)
            verticalLineToRelative(15.5f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(11.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(4.25f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineTo(6.25f)
            close()
            moveToRelative(3f, 1.5f)
            curveTo(9.664f, 5f, 10f, 5.336f, 10f, 5.75f)
            verticalLineToRelative(12.5f)
            curveTo(10f, 18.664f, 9.664f, 19f, 9.25f, 19f)
            reflectiveCurveTo(8.5f, 18.664f, 8.5f, 18.25f)
            verticalLineTo(5.75f)
            curveTo(8.5f, 5.336f, 8.836f, 5f, 9.25f, 5f)
            close()
            moveToRelative(6.25f, 0.75f)
            curveTo(15.5f, 5.336f, 15.164f, 5f, 14.75f, 5f)
            reflectiveCurveTo(14f, 5.336f, 14f, 5.75f)
            verticalLineToRelative(12.5f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(5.75f)
            close()
        }
    }.build()
}
