package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Shifts28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Shifts28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineToRelative(15.5f)
            curveTo(23.545f, 3f, 25f, 4.455f, 25f, 6.25f)
            verticalLineToRelative(15.5f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 25f, 3f, 23.545f, 3f, 21.75f)
            verticalLineTo(6.25f)
            close()
            moveToRelative(11.5f, 1.5f)
            curveTo(14.5f, 7.336f, 14.164f, 7f, 13.75f, 7f)
            reflectiveCurveTo(13f, 7.336f, 13f, 7.75f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(5.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(19.664f, 14f, 19.25f, 14f)
            horizontalLineTo(14.5f)
            verticalLineTo(7.75f)
            close()
        }
    }.build()
}
