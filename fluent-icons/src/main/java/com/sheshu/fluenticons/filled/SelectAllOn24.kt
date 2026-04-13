package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SelectAllOn24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SelectAllOn24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineToRelative(9.5f)
            curveTo(17.545f, 3f, 19f, 4.455f, 19f, 6.25f)
            verticalLineToRelative(9.5f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineToRelative(-9.5f)
            curveTo(4.455f, 19f, 3f, 17.545f, 3f, 15.75f)
            verticalLineToRelative(-9.5f)
            close()
            moveToRelative(12.28f, 2.78f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            lineTo(10f, 12.19f)
            lineToRelative(-1.97f, -1.97f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(2.5f, 2.5f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            lineToRelative(4.75f, -4.75f)
            close()
            moveTo(6.5f, 20f)
            curveToRelative(0.578f, 0.902f, 1.59f, 1.5f, 2.741f, 1.5f)
            horizontalLineToRelative(7.005f)
            curveToRelative(2.902f, 0f, 5.254f, -2.352f, 5.254f, -5.254f)
            verticalLineTo(9.241f)
            curveToRelative(0f, -1.151f, -0.598f, -2.163f, -1.501f, -2.741f)
            verticalLineToRelative(9.746f)
            curveToRelative(0f, 2.073f, -1.68f, 3.753f, -3.753f, 3.753f)
            horizontalLineTo(6.5f)
            close()
        }
    }.build()
}
