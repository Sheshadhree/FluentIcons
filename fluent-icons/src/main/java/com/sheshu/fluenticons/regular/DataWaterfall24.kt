package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.DataWaterfall24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DataWaterfall24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 3.75f)
            curveTo(2f, 3.336f, 2.336f, 3f, 2.75f, 3f)
            horizontalLineToRelative(6.5f)
            curveToRelative(1.243f, 0f, 2.25f, 1.007f, 2.25f, 2.25f)
            verticalLineTo(11f)
            horizontalLineToRelative(6.25f)
            curveToRelative(1.243f, 0f, 2.25f, 1.007f, 2.25f, 2.25f)
            verticalLineToRelative(6.25f)
            horizontalLineToRelative(1.25f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(21.664f, 21f, 21.25f, 21f)
            horizontalLineToRelative(-6.5f)
            curveToRelative(-1.243f, 0f, -2.25f, -1.007f, -2.25f, -2.25f)
            verticalLineTo(12.5f)
            horizontalLineTo(6.25f)
            curveTo(5.007f, 12.5f, 4f, 11.493f, 4f, 10.25f)
            verticalLineTo(4.5f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 4.5f, 2f, 4.164f, 2f, 3.75f)
            close()
            moveTo(18.5f, 19.5f)
            verticalLineToRelative(-6.25f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineTo(14f)
            verticalLineToRelative(6.25f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(3.75f)
            close()
            moveTo(10f, 5.25f)
            curveTo(10f, 4.836f, 9.664f, 4.5f, 9.25f, 4.5f)
            horizontalLineTo(5.5f)
            verticalLineToRelative(5.75f)
            curveTo(5.5f, 10.664f, 5.836f, 11f, 6.25f, 11f)
            horizontalLineTo(10f)
            verticalLineTo(5.25f)
            close()
        }
    }.build()
}
