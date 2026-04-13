package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.MoreHorizontal48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MoreHorizontal48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.752f, 24f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            reflectiveCurveToRelative(-3.25f, -1.455f, -3.25f, -3.25f)
            reflectiveCurveToRelative(1.455f, -3.25f, 3.25f, -3.25f)
            reflectiveCurveToRelative(3.25f, 1.455f, 3.25f, 3.25f)
            close()
            moveToRelative(11.5f, 0f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            reflectiveCurveToRelative(-3.25f, -1.455f, -3.25f, -3.25f)
            reflectiveCurveToRelative(1.455f, -3.25f, 3.25f, -3.25f)
            reflectiveCurveToRelative(3.25f, 1.455f, 3.25f, 3.25f)
            close()
            moveToRelative(8.25f, 3.25f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            reflectiveCurveToRelative(-1.455f, -3.25f, -3.25f, -3.25f)
            reflectiveCurveToRelative(-3.25f, 1.455f, -3.25f, 3.25f)
            reflectiveCurveToRelative(1.455f, 3.25f, 3.25f, 3.25f)
            close()
        }
    }.build()
}
