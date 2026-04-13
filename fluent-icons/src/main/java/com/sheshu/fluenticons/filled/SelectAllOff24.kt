package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SelectAllOff24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SelectAllOff24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.25f, 3f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineToRelative(9.5f)
            curveTo(3f, 17.545f, 4.455f, 19f, 6.25f, 19f)
            horizontalLineToRelative(9.5f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineToRelative(-9.5f)
            curveTo(19f, 4.455f, 17.545f, 3f, 15.75f, 3f)
            horizontalLineToRelative(-9.5f)
            close()
            moveToRelative(2.991f, 18.5f)
            curveToRelative(-1.151f, 0f, -2.163f, -0.598f, -2.741f, -1.501f)
            horizontalLineToRelative(9.746f)
            curveToRelative(2.073f, 0f, 3.753f, -1.68f, 3.753f, -3.753f)
            verticalLineTo(6.5f)
            curveTo(20.902f, 7.078f, 21.5f, 8.09f, 21.5f, 9.241f)
            verticalLineToRelative(7.005f)
            curveToRelative(0f, 2.902f, -2.352f, 5.254f, -5.254f, 5.254f)
            horizontalLineTo(9.241f)
            close()
        }
    }.build()
}
