package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Crop20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Crop20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 2.75f)
            curveTo(6f, 2.336f, 5.664f, 2f, 5.25f, 2f)
            reflectiveCurveTo(4.5f, 2.336f, 4.5f, 2.75f)
            verticalLineTo(4.5f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 4.5f, 2f, 4.836f, 2f, 5.25f)
            reflectiveCurveTo(2.336f, 6f, 2.75f, 6f)
            horizontalLineTo(4.5f)
            verticalLineToRelative(6.75f)
            curveToRelative(0f, 1.519f, 1.231f, 2.75f, 2.75f, 2.75f)
            horizontalLineTo(14f)
            verticalLineToRelative(1.75f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(15.5f)
            horizontalLineToRelative(1.75f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(17.664f, 14f, 17.25f, 14f)
            horizontalLineToRelative(-10f)
            curveTo(6.56f, 14f, 6f, 13.44f, 6f, 12.75f)
            verticalLineToRelative(-10f)
            close()
            moveToRelative(8f, 4.5f)
            verticalLineTo(13f)
            horizontalLineToRelative(1.5f)
            verticalLineTo(7.25f)
            curveToRelative(0f, -1.519f, -1.231f, -2.75f, -2.75f, -2.75f)
            horizontalLineTo(7f)
            verticalLineTo(6f)
            horizontalLineToRelative(5.75f)
            curveTo(13.44f, 6f, 14f, 6.56f, 14f, 7.25f)
            close()
        }
    }.build()
}
